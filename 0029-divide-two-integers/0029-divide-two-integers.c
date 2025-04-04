int divide(int dividend, int divisor) {
    double ans = (double)dividend/divisor;
    if(ans<(pow(2,31)-1) && ans>(pow(-2,31)))
        return trunc(dividend/divisor);
    else if(ans>=(pow(2,31))-1)
        return pow(2,31)-1;
    return pow(-2,31);
}