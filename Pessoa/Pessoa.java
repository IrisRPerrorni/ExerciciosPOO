package Pessoa;

public class Pessoa {
    String nome;
    Integer idade;
    Double peso;
    Double altura;


    public Pessoa(String nome, Integer idade, Double peso, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void descricao(){
        System.out.println("----------------Descrição da pessoa--------");
        System.out.println("O nome é : " + nome);
        System.out.println("A idade é: "+ idade);
        if (peso == 0){
            System.out.println("peso não informado!");
        } else if (peso > 0) {
            System.out.println("O peso é: " + peso);
        }
        System.out.println("A altura é: " + altura);
    }

    public Integer envelhecer(Integer newIdade) { //metodo com retorno e parametro
        Integer dezAnos = newIdade + idade;
        return dezAnos;
    }

    public void engordar(){
        if(peso == 0){
            System.out.println("peso não informado, não é possivel calcular!");

        } else if ( peso > 0){
            System.out.println(peso+10);
        }
    }
    public void emagrecer (){
        if (peso == 0){
            System.out.println("peso não informado, não é possivel calcular!");
        }else if ( peso > 0){
            System.out.println(peso-5);
        }
    }
    public void crescer(){
        if(idade < 21){
            double calcCrescer = ((21 - idade) * 0.5);
            System.out.println("Irá crescer "+ calcCrescer + " cm ");
        } else {
            System.out.println("Não irá crescer,já passou dos 21 anos");
        }

    }
}



