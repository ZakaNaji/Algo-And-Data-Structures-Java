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
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;
  }

  pop() {
    if (this.length < 2) {
      this.head = null;
      this.tail = null;
      this.length = 0;
      return;
    }
    let node = this.head;
    console.log(node);
    while (node.next.next != null) {
      console.log(node);
      node = node.next;
    }
    node.next = null;
    this.tail = node;
    this.length--;
  }
}

const myLinkedList = new MyLinkedList(1);
myLinkedList.append(2);
myLinkedList.append(3);
myLinkedList.pop();
console.log(myLinkedList);
myLinkedList.pop();
console.log(myLinkedList);
myLinkedList.pop();
console.log(myLinkedList);
