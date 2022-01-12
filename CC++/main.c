#include <stdio.h> 

 void main (){
     float m[50][50];
     int i,j,s; 
     for (i=0; i<50; i++)
     {for (j=0 ; j<50 ; j++)
     {
         
printf ("remplir la matrice %d", i+1 ,j+1);
scanf("%f, &m[i][j]"); 
     }}
     s=0;
     for (i=0; i<50; i++)
     {for (j=0 ; j<50 ; j++)
     { s==s+m[i][j]+ m[j][i]; 
     }
     }
 } 
