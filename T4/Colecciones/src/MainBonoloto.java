public class MainBonoloto {
    public static void main(String[] args) {
        Bonoloto bonoloto = new Bonoloto();
        // numerosSistema [0,0,0,0,0]
        // numerosUsuario [0,0,0,0,0]
        bonoloto.generarNumerosSistema();
        // numerosSistema = [3,6,8,13,19]
        bonoloto.pedirNumerosUsuario();
        // numerosUsuario = [4,6,10,12,19]
        bonoloto.comprobarAciertosSistema();
        bonoloto.resolucion();

        // comprobar cuantos aciertos
    }
}
