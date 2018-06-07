package Controle;

import ConexaoBD.ConexaoDesconexao;
import Modelo.Imovel;
import java.awt.List;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ImovelDAO {

     ConexaoDesconexao conexao = new ConexaoDesconexao();
     
     /*
     Imovel_id       | int(11)       | NO   | PRI | NULL    | auto_increment |
    | Tipo            | varchar(12)   | YES  |     | NULL    |                |
    | Cidade          | varchar(25)   | YES  |     | NULL    |                |
    | Bairro          | varchar(25)   | YES  |     | NULL    |                |
    | CEP             | varchar(9)    | YES  |     | NULL    |                |
    | Rua             | varchar(50)   | YES  |     | NULL    |                |
    | Numero          | int(11)       | YES  |     | NULL    |                |
    | Qtd_quarto      | int(11)       | YES  |     | NULL    |                |
    | Tamanho         | decimal(10,0) | YES  |     | NULL    |                |
    | Observacao      | varchar(160)  | YES  |     | NULL    |                |
    | Valor_locacao   | decimal(10,0) | YES  |     | NULL    |
    | Imovel_situacao | varchar(10)   | YES  |     | NULL    |                |
    
    */
    //METODO PARA ADD NOVO IMOVEL
    public void create(Imovel im){
        Connection con = conexao.Conectar();
        PreparedStatement stmt = null;
         try {
             stmt = con.prepareStatement("INSERT INTO IMOVEL (tipo, cidade, bairro, cep, rua, numero, qtd_quarto, tamanho, observacao, valor_locacao, imovel_situacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 'Disponível')");
             stmt.setString(1, im.getTipo());
             stmt.setString(2, im.getCidade());
             stmt.setString(3,im.getBairro());
             stmt.setString(4,im.getCEP());
             stmt.setString(5, im.getRua());
             stmt.setInt(6, im.getNumero());
             stmt.setInt(7, im.getQtdQuarto());
             stmt.setDouble(8, im.getTamanho());
             stmt.setString(9,im.getObs());
             stmt.setDouble(10, im.getValor());
             
             stmt.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
             Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
         }finally{
             conexao.Desconectar();
        }
    }
    
    public void update(Imovel im){
        Connection con = conexao.Conectar();
        PreparedStatement stmt = null;
         try {
             stmt = con.prepareStatement("UPDATE imovel SET tipo = ?, cidade = ?, bairro = ?, cep = ?, rua = ?, numero = ?, qtd_quarto = ?, tamanho = ?, observacao = ?, valor_locacao = ? WHERE IMOVEL_ID = ?");
             stmt.setString(1, im.getTipo());
             stmt.setString(2, im.getCidade());
             stmt.setString(3,im.getBairro());
             stmt.setString(4,im.getCEP());
             stmt.setString(5, im.getRua());
             stmt.setInt(6, im.getNumero());
             stmt.setInt(7, im.getQtdQuarto());
             stmt.setDouble(8, im.getTamanho());
             stmt.setString(9,im.getObs());
             stmt.setDouble(10, im.getValor());
             stmt.setInt(11, im.getId());
             
             stmt.executeUpdate();
             
             JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
             Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Erro ao atualizar" + ex);
         }finally{
             conexao.Desconectar();
        }
    }
    
    public void delete(Imovel im) {

        Connection con = conexao.Conectar();        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM imovel WHERE imovel_id = ?");
            stmt.setInt(1, im.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            conexao.Desconectar();
        }
    }
    
    public java.util.List<Imovel> listaImovelDisponivel(){
        Connection con = conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        java.util.List<Imovel> imoveis = new ArrayList<>();
        
         try {
             stmt = con.prepareStatement("SELECT imovel_id, rua, numero, bairro, cidade, cep, tipo, qtd_quarto, tamanho, valor_locacao, observacao  from imovel where imovel_situacao like 'Dispon_vel'");
             rs = stmt.executeQuery();//colocando dentro do resultset
             
             while(rs.next()){
                 Imovel imovel = new Imovel();
                 imovel.setId(rs.getInt("imovel_id"));
                 imovel.setRua(rs.getString("rua"));
                 imovel.setNumero(rs.getInt("numero"));
                 imovel.setBairro(rs.getString("bairro"));
                 imovel.setCidade(rs.getString("cidade"));
                 imovel.setCEP(rs.getString("CEP"));
                 imovel.setTipo(rs.getString("tipo"));
                 imovel.setQtdQuarto(rs.getInt("qtd_quarto"));
                 imovel.setTamanho(rs.getDouble("tamanho"));
                 imovel.setValor(rs.getDouble("valor_locacao"));
                 imovel.setObs(rs.getString("observacao"));
                 
                imoveis.add(imovel);//colocando o resultado do select dentro do array list
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             conexao.Desconectar();
         }
         return imoveis;
    } 
    
    public java.util.List<Imovel> listaImovelLocado(){
        Connection con = conexao.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        java.util.List<Imovel> imoveis = new ArrayList<>();
        
         try {
             stmt = con.prepareStatement("SELECT imovel_id, rua, numero, bairro, cidade, cep, tipo, qtd_quarto, tamanho, valor_locacao, observacao  from imovel where imovel_situacao like 'Locado'");
             rs = stmt.executeQuery();//colocando dentro do resultset
             
             while(rs.next()){
                 Imovel imovel = new Imovel();
                 imovel.setId(rs.getInt("imovel_id"));
                 imovel.setRua(rs.getString("rua"));
                 imovel.setNumero(rs.getInt("numero"));
                 imovel.setBairro(rs.getString("bairro"));
                 imovel.setCidade(rs.getString("cidade"));
                 imovel.setCEP(rs.getString("CEP"));
                 imovel.setTipo(rs.getString("tipo"));
                 imovel.setQtdQuarto(rs.getInt("qtd_quarto"));
                 imovel.setTamanho(rs.getDouble("tamanho"));
                 imovel.setValor(rs.getDouble("valor_locacao"));
                 imovel.setObs(rs.getString("observacao"));
                 
                imoveis.add(imovel);//colocando o resultado do select dentro do array list
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
         }finally{
             conexao.Desconectar();
         }
         return imoveis;
    } 
    
    
         
     //retorna o nome do cliente apartir do codigo(teste)
     public String retornaNomeCliente(String cod) throws SQLException{
        //System.out.println(" cod e " + cod);
        Connection con = conexao.Conectar();
         String sql  = "select cliente_nome"
                + "      from cliente "
                + "     where cliente_id = ?";
        java.sql.PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, cod);
        } catch (SQLException ex) {
            Logger.getLogger(ImovelDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet nome = statement.executeQuery();
        nome.next();
        String placa2 = nome.getString("cliente_nome");
        //System.out.println("o sql eh " + placa2);
        return placa2;
    }
    
}
