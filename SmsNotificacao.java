public class SmsNotificacao extends Notificacao {
    private static final int LIMITE = 160;

    public SmsNotificacao(string telefone){
        super(telefone);
    }

    @Override
    protected string tipo() {
        return "SMS";
    }

    @Override
    public void enviar(string mensagem) {
        string texto = mensagem.length() > LIMITE
                ? mensagem.substring(0, LIMITE)
                :mensagem;
        System.out.println(cabecalho() + ": " + texto);
    }
}