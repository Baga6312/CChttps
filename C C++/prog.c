#include <stdio.h>

 void main () {
    int n ; 
    int T[100][100] ; 
   do {
        printf (" donner un entier\n") ; 
         scanf ("%d",&n); 
    } while(!((n>0)&&(n<100))) ; 
    int i , j ; 
     for (i=0 ; i <n ; i ++ ) {
          for ( j=0 ; j < n ; j ++ ){
               T[i][j] = rand () %20 ; 
          }
     }
      for ( i = 0 ; i < n ; i ++ ) {
          printf("\n");
          for(j=0 ; j< n ; j ++ ){
               printf ("%d ",T[i][j]) ; 
          }
      }
 }