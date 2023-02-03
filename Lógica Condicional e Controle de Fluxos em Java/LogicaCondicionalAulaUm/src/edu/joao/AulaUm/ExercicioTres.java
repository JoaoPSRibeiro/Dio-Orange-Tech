package edu.joao.AulaUm;

public class ExercicioTres {
    public static void main(String[] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias(); 

    }
    private static void ifFlecha(){

        int mes = 9;
        
        if(mes == 1){
            System.out.println("Janeiro");
        }else{
            if(mes == 2){
                System.out.println("Fevereiro");
            }else{
                if(mes ==3){
                    System.out.println("Março");
                }else{
                    if(mes == 4){
                        System.out.println("Abril");
                    }else{
                        if(mes == 5){
                            System.out.println("Maio");
                        }else{
                            if(mes == 6){
                                System.out.println("Junho");
                            }else{
                                if(mes == 7){
                                    System.out.println("Julho");
                                }else{
                                    if(mes == 8){
                                        System.out.println("Agosto");
                                    }else{
                                        if(mes == 9){
                                            System.out.println("Setembro");
                                        }else{
                                            if(mes == 10){
                                                System.out.println("Outubro");
                                            }else{
                                                if(mes == 11){
                                                    System.out.println("Novembro");
                                                }else{
                                                    if(mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else{
                                                        System.out.println("Mês Inválido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

            //Este volume de if's demonstra que o código foi mal projetado, falha típica de iniciantes!!!!! (que é o meu caso... rsrsrsr)
    
    
        }

    private static void ifSemFlecha(){
        int mes = 10;

        if(mes == 1){
            System.out.println("Janeiro");
        }else if (mes ==2) {
            System.out.println("Fevereiro");
        }else if (mes == 3){
            System.out.println("Março");
        }else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Maio");
        }else if (mes == 6){
            System.out.println("Junho");
        }else if (mes == 7){
            System.out.println("Julho");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Setembro");
        }else if (mes == 10){
            System.out.println("Outubro");
        }else if (mes == 11){
            System.out.println("Novembro");
        }else if (mes == 12){
            System.out.println("Dezembro");
        }else {
            System.out.println("Erro");
        }
}    

private static void ifFerias(){

    String mes = "Julho";
    if (mes == "Janeiro" || mes == "Julho" || mes == "Dezembro"){
        System.out.println("Férias!!!");
    } //Neste caso do ifFerias, por ter só uma variável, o ideal era termos utilizado o Switch e não o || 
}

private static void ifMenor(){

    double salarioMensal = 11893.58d;
    double mediaSalario = 10500d;

    int quantidadeDependentes = 4;
    int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

    boolean salarioBaixo = salarioMensal < mediaSalario; // reduzimos para uma variável o quesito salário
    boolean muitosDependentes = quantidadeDependentes >= mediaDependentes; // reduzimos para uma variável a quantidade de dependentes

    if((salarioBaixo) && (muitosDependentes)){
            System.out.println("Funcionário deve receber Auxílio");
        }

    boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
    if(recebeAuxilio){
        System.out.println("Deve receber Auxilio ");
    }else{
        System.out.println("Não recebe Auxílio");
        }
        
    }

private static void switchSemana(){

    String dia = "Terça";
        switch (dia){
            case "Segunda":
                System.out.println("Dia 2");
                break;
            case "Terça":
                System.out.println("Dia 3");
                break;
            case "Quarta":
                System.out.println("Dia 4");
                break;
            case "Quinta":
                System.out.println("Dia 5");
                break;
            case "Sexta":
                System.out.println("Dia 6");
                break;
            case "Sábado":
                System.out.println("Dia 7");
                break;
            case "Domingo":
                System.out.println("Dia 1");
                break;
            default: // Default deve SEMPRE ser usado como forma de previnir erro e não como o comportamento esperado pelo sistema
                System.out.println("Dia Inválido");
        }   
}

private static void switchNumero(){
    int Numero = 3;

    switch (Numero){
        case 1:
            System.out.println("Certo");
            break;
        case 2:
            System.out.println("Certo");
            break;
        case 3:
            System.out.println("Certo");
            break;
        case 4:
            System.out.println("Errado");
            break;
        case 5:
            System.out.println("Talvez");
            break;
        default:
            System.out.println("Valor inválido");
            break;
    }
}

private static void switchFerias(){
    String Ferias = "Janeiro";

switch  (Ferias){
    case "Janeiro":
    case "Julho":
    case "Dezembro":
        System.out.println("Férias!!!! Aproveite!!!!");
        break;
    default:
        System.out.println("Este não será seu Mês de Férias!!!");
        break;
}
}
}