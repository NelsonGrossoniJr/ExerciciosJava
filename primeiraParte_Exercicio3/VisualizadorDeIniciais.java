package primeiraParte_Exercicio3;

public class VisualizadorDeIniciais {
    public void visualizarIniciais(String input) {
        String[] partesDoNome = input.split(" ");
        StringBuilder iniciais = new StringBuilder();

        for (String parte : partesDoNome) {
            if (!deveIgnorar(parte)) {
                iniciais.append(Character.toUpperCase(parte.charAt(0))); // Converte a primeira letra para maiúscula
            }
        }

        System.out.println("As iniciais são: " + iniciais);
    }

    private boolean deveIgnorar(String parte) {
        boolean isPreposicao = false;

        switch (parte) {
            case "e":
            case "do":
            case "da":
            case "dos":
            case "das":
            case "de":
            case "di":
            case "du":
            isPreposicao = true;
        break;
        default:
            isPreposicao = false;
        
        }

    return isPreposicao;
    }
}
