
package br.com.unifacef.lista3.ex4;

public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Post p1 = new Post(1, "Fulano", "Vamos ajudar no Trote");
        
        Comment c1 = new Comment(101, "Beltrano", "Vou doar sangue");
        Comment c2 = new Comment(102, "Ciclano", "Vou doar alimentos");
        Comment c3 = new Comment(103, "João", "Vou doar suplemento");
        p1.addComment(c1);
        p1.addComment(c2);
        p1.addComment(c3);
        System.out.println(p1.toString());
        p1.removeComment(c2);
        System.out.println(p1.toString());
        
    }
    
}
