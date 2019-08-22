package br.com.projuris;

/**
 * Created by phelipe.pereira on 22/08/2019.
 */
public class MyFindArray implements FindArray{

    @Override
    public int FindArray(int[] tam1, int[] subTam1){
        int cont=0,x=0,y=0, pos = -1;
        int tamanho1, tamanho2;
        tamanho1 = tam1.length;
        tamanho2 = subTam1.length;

        if(tamanho1 > tamanho2){
            while(x <(tamanho1)){

                for(y=0;y<tamanho2;y++){

                    if(tam1[x] == subTam1[y]){
                        pos = x;
                        if(y == (tamanho2-1)){
                            cont++;
                        }
                    }
                    else if(tam1[x] != subTam1[y]){
                        break;
                    }
                    x++;
                }
                x++;

            }

            if(cont>0){
                pos = pos - tamanho2 + 1;
            }
            else if(cont<=0){
                pos = -1;
            }
        }

        return pos;
    }
}

