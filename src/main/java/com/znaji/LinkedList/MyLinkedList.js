class MyLinkedList {
  constructor(value) {
    this.head = {
      value: value,
      next: null,
    };
    this.tail = this.head;
    this.length = 1;
  }

  append(value) {
    const newNode = {
      value: value,
      next: null,
    };
    this.head.next = newNode;
    this.tail = newNode;
    this.length++;
  }
}

const myLinkedList = new MyLinkedList(1);
myLinkedList.append(2);
console.log(myLinkedList);
