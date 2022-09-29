package application;

import entities.Account;
import entities.SavingsAccount;

/*  Em POO, polimorfismo é o recurso que permite que variáveis de um mesmo tipo mais genérico possam, apontar para objetos
    de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico

    - A associação do tipo específico com o tipo genérico é feita em tempo de execução(upcasting).

    - O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita(ele só sabe que são duas variáveis tipo Account):
 */
public class Program {
    public static void main(String[] args) {

        Account x = new Account(1225, "Carlos Duarte", 1000.0);

        Account y = new SavingsAccount(1326, "Flávia Marques", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);
    }
}
