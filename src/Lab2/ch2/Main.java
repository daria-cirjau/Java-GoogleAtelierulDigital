package Lab2.ch2;

public class Main {
    public static void afiseazaStudiouriCuMaiMultDe2Filme(Studio[] studiouri){
        for(Studio currentStudio:studiouri){
            if(currentStudio.getFilme().length>=2)
                System.out.println(currentStudio.getNume());
        }
    }

    public static String[] afiseazaActoriCu2Premii(Studio[] studiouri,String numeActor){
        String[] toReturn=new String[10];
        int i=0;
        int j=0;
        for(Studio currentStudio:studiouri){
            for(Film currentFilm: currentStudio.getFilme()){
                for(Actor currentActor:currentFilm.getActori())
                    if(currentActor.getNume().equals("Actor cu 2 Oscaruri")) {
                        toReturn[i] = currentStudio.getNume();
                        i++;
                        break;
                    }
                if(i>j){
                    j=i;
                    break; //iese din for ca sa nu existe duplicat
                }
            }

        }
        return toReturn;
    }

    public static void filmeActoriPeste50(Studio[] studioDatabase){
        for(Studio currentStudio:studioDatabase){
            for(Film currentFilm:currentStudio.getFilme()){
                for(Actor currentActor:currentFilm.getActori()){
                    if(currentActor.getVarsta()>50)
                        System.out.println(currentFilm.getNume());
                }
            }
        }
    }
    public static void main(String[] args) {


        Premiu oscar1990= new Premiu("Oscar",1990);
        Premiu oscar2000=new Premiu("Oscar",2000);
        Premiu oscar2010= new Premiu("Oscar",2010);
        Premiu oscar2018= new Premiu("Oscar",2018);

        Actor actorOscar1990=new Actor("Actor cu 2 Oscaruri",35,new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010=new Actor("Actor cu Oscar din 2010",55,new Premiu[]{oscar2010});
        Actor actorOscar2018=new Actor("Actor cu Oscar din 2018",23,new Premiu[]{oscar2018});
        Actor actorFaraPremiu01=new Actor("Actor fara Oscar 01",33,new Premiu[]{});
        Actor actorFaraPremiu02=new Actor("Actor fara Oscar 02",60,new Premiu[]{});
        Actor actorFaraPremiu03=new Actor("Actor fara Oscar 03",30,new Premiu[]{});

        Film film1=new Film(1990,"Film cu actoei de oscar",
                new Actor[]{actorOscar1990,actorFaraPremiu01});
        Film film2=new Film(2010,"Film cu actori fara premii2",
                new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});
        Film film3=new Film(2010,"Film cu actori fara premii3",
                new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});
        Film film4=new Film(2010,"Film cu actori de oscar",
                new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremiu03});

        Studio studio1=new Studio("MGM",new Film[]{film1,film2});
        Studio studio2=new Studio("Disney",new Film[]{film3,film4});

        Studio[] studioDatabase=new Studio[]{studio1,studio2};
        System.out.println("\nStudiouri cu mai mult de 2 filme:");
        afiseazaStudiouriCuMaiMultDe2Filme(studioDatabase);
        String[] result= afiseazaActoriCu2Premii(studioDatabase,"Actor Fara Oscar 01");
        System.out.println("\nStudiouri cu actori cu 2 premii");
        for(String currentName: result)
            if(currentName!=null)
                System.out.println(currentName);
        System.out.println("\nFilme cu actori care au peste 50 de ani:");
        filmeActoriPeste50(studioDatabase);
    }

}
