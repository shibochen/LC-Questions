# Important Notes about Integer

## Numeric Data Type

![data type](https://user-images.githubusercontent.com/38870192/39738061-c1faf6d2-5256-11e8-9dc9-0b0e29c8915b.PNG)

## 常用 

`Integer.MAX_VALUE`      `Integer.MIN_VALUE`


## Convert to Integer

1. String to Integer

`Integer.parseInt(str, base)` <br />
`Integer.valueOf(str)`
`Integer.toBinaryString(str)`

`
while(i < str.length()){
    result = result * 10 + str.charAt(i) - '0';
}
`
2. Reverse Integer
`
while(n != 0){
    result = result * 10 + n % 10;
    n /= 10;
}
`
