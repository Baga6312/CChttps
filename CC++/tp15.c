  #include <stdio.h> 

   int compt (char x ) {
        int i ,j,nb; 
        nb = 0 ; 
         for ( i = 65 ; i<97 ; i ++ ) { 
             for (j = 0 ; j < strln(x) ; j ++ ){
                  if ( i == (int) x[j].toUpper()){ 
                       nb = nb + 1 ; 
                   }
            }
        }
   }
   