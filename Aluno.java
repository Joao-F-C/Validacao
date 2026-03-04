/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if((nome.length()>=2)&&(nome.length()<=100)) {
            this.nome = nome;
    } else{
            throw new Exception("O nome deve ter entre 2 e 100 caracteres.");
        }
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) throws Exception {
        if ((nota1>=0)&&(nota1<=10)) {
        this.nota1 = nota1;
}else {
            throw new Exception("A nota deve estar entre [0,10]");
        }
    }
    public void setNota1(String nota1) throws Exception{
        this.setNota1(Double.parseDouble(nota1));
    }
    
    public double getNota2() {
        return nota2;
    }


    public void setNota2(double nota2) throws Exception {
        if ((nota1>=0)&&(nota1<=10)) {
            this.nota2 = nota2;
        }else {
            throw new Exception("A nota deve estar entre [0,10]");
        }
    }
    public void setNota2(String nota2) throws Exception{
        this.setNota2(Double.parseDouble(nota2));
    }
}
