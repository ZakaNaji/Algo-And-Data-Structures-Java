class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class MyLinkedList {
  constructor(value) {
    const node = new Node(value);
    this.head = node;
    this.tail = node;
    this.length = 1;
  }

  append(value) {
    const newNode = new Node(value);
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;
    return this;
  }

  pop() {
    if (this.length < 2) {
      this.head = null;
      this.tail = null;
      this.length = 0;
      return this;
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
    return this;
  }

  prepend(value) {
    let newNode = new Node(value);
    newNode.next = this.head;
    this.head = newNode;
    this.length++;
    return this;
  }
}

const myLinkedList = new MyLinkedList(1);
myLinkedList.append(2);
myLinkedList.append(3);
console.log(myLinkedList.prepend(0));
