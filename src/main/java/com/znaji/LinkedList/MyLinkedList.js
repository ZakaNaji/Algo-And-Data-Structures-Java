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

  insert(index, value) {
    if (index === 0) {
      return this.prepend(value);
    }

    if (index >= this.length) {
      return this.append(value);
    }

    const newNode = new Node(value);
    const prevNode = this.traverse(index - 1);
    const currentNode = prevNode.next;
    newNode.next = currentNode;
    prevNode.next = newNode;
    this.length++;
    return this;
  }

  removeHead() {
    const currentNode = this.head;
    this.head = currentNode.next;
    currentNode.next = null;
    this.length--;

    if (this.length === 0) {
      this.tail = null;
    }

    return this;
  }

  remove(index) {
    if (index >= this.length) {
      throw new Error("index out of bound");
    }

    if (index === 0) {
      return this.removeHead();
    }

    const prevNode = this.traverse(index - 1);
    const currentNode = prevNode.next;
    prevNode.next = currentNode.next;
    currentNode.next = null;
    this.length--;

    if (index === this.length) {
      this.tail = prevNode;
    }

    return this;
  }

  traverse(index) {
    let currentNode = this.head;
    let counter = 0;
    while (counter < index) {
      currentNode = currentNode.next;
      counter++;
    }
    return currentNode;
  }

  printList() {
    let node = this.head;
    console.log("{");
    while (node !== null) {
      console.log(node.value + " --> ");
      node = node.next;
    }
    console.log("}");
  }
}

const myLinkedList = new MyLinkedList(1);
myLinkedList.append(2);
myLinkedList.append(3);
myLinkedList.insert(0, 0);
myLinkedList.printList();
myLinkedList.removeHead();
myLinkedList.printList();
myLinkedList.remove(1);
myLinkedList.printList();
