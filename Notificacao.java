public abstract class Notificacao {
    protected final string destinatario;

    protected Notificacao(string destinatario) {
        this.destinatario = destinatario;
    }

    protected abstract string tipo();
    public abstract void enviar(string mensagem);

    protected string Cabecalho() {
        return "[" + tipo() + "] para " + destinatario;
    }

}