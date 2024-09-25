package DAL;

// thirth step

import java.sql.Connection;
import java.sql.DriverManager;

//criação do banco de dados.

/*
create database crudCarros
go 

use crudCarros 
go

create table Carros
(
	id int primary key identity(1,1),
	modelo varchar (20),
	fabricante varchar (20),
	cor varchar (10),
	ano int,
	valor float
)

select *from Carros
*/


public class Conexao
{
    public Connection con; 
    public String mensagem;
    private String stringConexao = "jdbc:sqlserver://localhost\\LUCAS\\SQLEXPRESS:1433;databaseName=crudCarros;encrypt=false";
    
    public Connection conectar ()
    {
        this.mensagem = "";
        try
        {
            if (con == null || con.isClosed())
            {
                con = DriverManager.getConnection(stringConexao, "sa", "0421");
            }
        } 
        catch (Exception e)
        {
            mensagem = "Erro de conexâo";
        }
        return con;
    }
    
    public void desconectar()
    {
        try
        {
            if(!con.isClosed())
                con.isClosed();
        } 
        catch (Exception e)
        {
            mensagem = "Erro ao fechar conexão";
        }
    }
            
}
