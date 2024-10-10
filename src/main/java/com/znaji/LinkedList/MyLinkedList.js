class MyLinkedList {
  constructor(value) {
    this.head = {
      value: value,
      next: null,
    };
    this.teal = this.head;
    this.length = 1;
  }
}

const myLinkedList = new MyLinkedList(1);
console.log(myLinkedList);
