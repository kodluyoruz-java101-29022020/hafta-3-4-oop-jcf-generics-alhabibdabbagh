package soru2;



public class BagliList {
	
	Node head; // baş düğüm
	
	// tek yönlü 
	
//	public void insert(int value) {
//		Node node=new Node();
//		node.value=value;
//		node.next=null;
//		
//		if (head==null) {
//			head=node;
//		}else {
//			Node n=head;
//			while(n.next!=null) {
//				n=n.next;
//			}
//			n.next=node;
//			
//		}
//		
//	}
//	public void insertAtStart(int value ) {
//		Node node=new Node();
//		node.value=value;
//		node.next=head;
//		head=node;
//		if (head==null) {
//			head=node;
//		}
//		
//	}
//	
//	public void insertAt(int Index,int value) {
//		if (Index==0) {
//			insertAtStart(value);
//		}else {
//		Node node =new Node();
//		node.value=value;
//		
//	
//		
//		Node n=head;
//		for (int i = 0; i < Index-1; i++) {
//			n=n.next;
//		}
//		node.next=n.next;
//		n.next=node;
//		}
//		
//	}
//	public void delete(int index) {
//		if (index==0) {
//			head=null;
//		}else {
//			Node n =head;
//			Node n1=null;
//			for (int i = 0; i < index-1; i++) {
//				n=n.next;
//			}
//			n1=n.next;
//			n.next=n1.next;
//			System.out.println("burdaki silinen"+n1.value);
//		}
//		
//		
//		
//	}
//
//	public Node newNode() {
//		Node node=new Node();
//		node.next=null;
//		node.prev=null;
//	
//		return node;
//	
//	}
	
	
	public void insertDoubly (int value ) {
		Node node= newNode(value); // yeni node oluştu
		
		
		if (head==null) {// list boş ise 
			head=node;// eklenen node head olsun 
		}else {// lis boş degil ise 
		Node n = head;  // head den bir kopyasi al 
		while(n.next!=null) {// ve list ye  sonra kadar git 
			n=n.next;
		}
		n.next=node;  // sonraki normal null ama biz node olsun dedik 
		node.prev=n;// node un onceki n ilsart etsin 
		node.next=null;// boylece node son eleman olmus
		}
		
		
	}
	public Node newNode(int value) {

	
		Node node=new Node();// yeni node eklme obj olusturuyoruz 
		node.next=null;
		node.prev=null;
		node.value=value;// degeri da atiyoruz 
		return node;
	
	}

	
	public void insertAtStratDoubly(int value) {// basiya eklmek istesek
	Node node=	newNode(value); // yeni node
	Node n=head;// head den kopya al 
	if(head==null) {
		head=node;// list bos ise 
	
	}else {// list bos degil ise 
		n.prev=node;// bu normal da null cunku head'in onceki null o yuzden node ordan bagladik 
		node.next=n;// node sonraki head'a bagladik
		node.prev=null;// ve node onceki null oldu 
		head=node;// node head yaptik cunku en basta o artik 
	}
			
	}
	
	
	public void deleteDoubly(int index) {
		Node n =head;
		if (index==0) {// head'i silmek istesek 
			n=n.next; // bir sonraki node git 
			n.prev=null;// ve onceki null yap
			head=n;// node head oldu yani ikinci node 
		}else {// head degil ise 
		
	for (int i = 0; i < index-1; i++) {// burda -1 onemli 
		n=n.next;// dolassin istedigimiz yere gelene kadar 
	}
	n.next.prev=n.prev;//node sonraki onceki ile node onceki baglan 
	n.prev.next=n.next;// node onceki sonraki ile node sonraki baglan
	n=null;		// aradaki node null yap 
		}
	}

	
	
	public void insertAtDoubly(int index,int value) {// beli bir yere ekleme istesek 
		if (index==0) {// bas 
			insertAtStratDoubly(value);
		}else {// ortaya eklemek icin 
			Node node=newNode(value);// yeni node 
			Node n=head;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			Node n1=null;// n1 node u degerler kaybetmemek icin bu node'da tuttuk 
			n1=n.next; // sonraki n1 da 
			n.next=node;// sonraki node 
			node.prev=n;// onceki n
			node.next=n1;// node sonraki n1 den aldik 
			n1.prev=node;// n1.onceki 
			n1=null;
		}
	}
	
	public int sizeDoubly() {// size bulmak icin 
		Node n =head;
		int count=0;
		while(n.next!=null) {
			n=n.next; // list te dolassin 
			count++;// count bir arttir
		}
		count++;
		return count;
	}
	
	public int getDoubly(int index) {// istedigimiz value getirmek 
		Node n =head;
		for (int i = 0; i < index-1; i++) {
			n=n.next;
		}
		int value=n.value;
		return value;
	}
	
	public void show() { // yadirma islemi hem gidis hem donus olarak yazdiriyoruz ki bakalim sonraki ve onceki baglari dogru mu yaptik 
		Node x =head;
		
		while(x.next!=null) {// next gore yazdiriyoruz 
			System.out.println(x.value);
			x=x.next;
		}
		
		System.out.println(x.value);
		if(x.prev!=null) {// prev gore yazdiriyoruz 
		System.out.println("reverse : ");
		while(x.prev!=head.prev) {
			System.out.println(x.value);
			x=x.prev;
		}
		System.out.println(x.value);
		
		
		}
		
		
	}
	
}
