/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
public class Cliente {
    private String CPF;
    private String Nome;
    private char Sexo;
    private String Nascimento;

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public char getSexo() {
        return Sexo;
    }
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }
    public String getNascimento() {
        return Nascimento;
    }
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }
}
