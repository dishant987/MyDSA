function add(number) {
    if(number>0){
        return number + add(number -1)
    }
    return number
  }

  console.log(add(2))