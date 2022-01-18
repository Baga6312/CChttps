#include <stdio.h>
#include "lib.h"

 int main (void){
      double radius = 3.0 ;
      double volume ;  
      volume = radius2Volume(radius); 
      printf ("pi is approximated as %5.3f.\n",MY_PI) ; 
      printf ("The volume of the sphere is %8.4lf.\n",volume) ; 
      return 0 ; 
 }