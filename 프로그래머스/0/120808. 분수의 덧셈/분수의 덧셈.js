function cal_gcd(a, b) {
    return a % b === 0 ? b : cal_gcd(b, a % b)
}

function solution(numer1, denom1, numer2, denom2) {
    let resultNumer = numer1 * denom2 + numer2 * denom1;
    let resultDenom = denom1 * denom2;
    
    let gcd = cal_gcd(resultDenom, resultNumer);
    
    return [resultNumer / gcd, resultDenom / gcd];
}