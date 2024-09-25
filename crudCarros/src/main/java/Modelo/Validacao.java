package Modelo;

// fifth step

import java.util.List;

public class Validacao
{
   public String mensagem = "";
   public int ano;
   public Double valor;
   
   public void validarCarro(List<String> listaDadosCarro)
   {
       this.mensagem = "";
       
      if(listaDadosCarro.get(0).length() == 0);
        this.mensagem += "modelo obrigatorio";
      if(listaDadosCarro.get(1).length() == 0);
        this.mensagem += "fabricante obrigatorio";
      if(listaDadosCarro.get(2).length() == 0);
        this.mensagem += "cor obrigatoria";
      
        try
       {
           this.ano = Integer.parseInt(listaDadosCarro.get(3));
           this.valor = Double.parseDouble(listaDadosCarro.get(4));
       } 
        catch (Exception e)
       {
           this.mensagem = "Erro de ano ou valor";
       }
      
   }
}
