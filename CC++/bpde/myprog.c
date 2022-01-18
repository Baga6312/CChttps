#include <math.h>
#include "lib.h" 

double cuber ( double x) {
    return (pow(x,3.0)) ; 
}
double radius2Volume(double rad) {
    return((4.0/3.0)*MY_PI*cuber(rad)) ; 
}