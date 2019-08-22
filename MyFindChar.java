package br.com.projuris;

/**
 * Created by phelipe.pereira on 22/08/2019.
 */
public class MyFindChar implements FindCaracter{

    @Override
    public char findChar(String word) {
        char[] letra = {};
        char retorno = ' ';
        int y=0,x=0,tam1=0; //cont=0;
        tam1 = word.length();
        letra = word.toCharArray();

        while(x<tam1){

            for(y=0;y<=tam1-1;y++){
                if(x!=y){
                    if(letra[x] == letra[y]){
                        if(y>x && y!=(tam1-1)){  //&& y!=(tam1-1)
                            x++;
                        }
                        break;
                    }
                    else if(letra[x] != letra[y]){  //&& y == (tam1-1)
                        if(y == (tam1-1) || x == (tam1-1)){
                            retorno = word.charAt(x);
                            break;
                        }

                    }
                }
            }
            if(y == (tam1-1) && letra[x]!=letra[y]) break;

            else if(x==(tam1-2) && y==(tam1-1)) break;

            else if(y < (tam1-1) && x == (tam1-1)) break;

            x++;
        }
        return retorno;
    }
}

