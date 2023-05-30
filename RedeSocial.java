public abstract class RedeSocial{

    protected String senha;
    protected int numAmigos;

    //construtor superclass
    public RedeSocial(String senha, int numAmigos){
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public abstract void postarFoto();{
       System.out.println("Postou uma foto");
    }

    public abstract void postarVideo();{
        System.out.println("Postou um video");
    }

    public abstract void postarComentario();{
        System.out.println("Postou um comentário");
    }

    public abstract void curtirPublicacao();{
        System.out.println("Curtiu uma publicação");
    }

}