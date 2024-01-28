package primeiraParte_Exercicio1;

public class VisualizadorDoisPrimeirosCarcteres
{
    public void visualizarDoisPrimeirosCaracteres( String input )
    {
        if (input.length() >= 2) {
            String doisPrimeiros = input.substring(0, 2);
            System.out.println("Os dois primeiros caracteres da string são: " + doisPrimeiros);
        } else {
            System.out.println("A string é muito curta");
        }
    }
}
