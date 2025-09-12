class Human {
  userName: string;
  age: number;
  email: string;

  public constructor(userName: string, age: number, email: string) {
    this.age = age;
    this.email = email;
    this.userName = userName;
  }
}

function testClass() {
  const myHUman = new Human("mingma", 20, "mingma@gmail.com");

  console.log(myHUman);
}

function helloworld(): string {
  return "2";
}
testClass();
console.log(helloworld());
