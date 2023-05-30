public class Main{
    public static void main(String[] args){

        final RedeSocial[] redeSocial = new RedeSocial[2];
        final RedeSocial redesSociais1 = new Facebook("FelipeSenhaFb", 0);
        final RedeSocial redesSociais2 = new Instagram("FelipeSenhaIg", 141);

        redeSocial[0] = redesSociais1;
        redeSocial[1] = redesSociais2;

        final Usuario user1 = new Usuario("Felipe", "feliperibeiro@gmail.com", redeSocial);

        try {
            user1.mostraInfoRedeSocial();
        }catch (NoFoundSocialMediaException e) { e.printStackTrace();
        }
    }
}