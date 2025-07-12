/* 
도서관에서 사용할 수 있는 간단한 도서 관리 시스템을 만들어 보자. 이 시스템은 여러 권의 도서 정보를 관리할 수 있어
야 한다. 각 도서는 도서 제목( title )과 저자명( author )을 가지고 있다. 시스템은 도서를 추가하고, 모든 도서의 정
보를 출력하는 기능을 제공해야 한다.
- Library 클래스를 완성해라.
    - LibraryMain 과 실행 결과를 참고하자.
- Book 클래스는 Library 내부에서만 사용된다. Library 클래스 외부로 노출하면 안된다.
- Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다.
*/

package nested.test.ex1;

public class Library {
    private static class Book {
        private String title;
        private String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    private Book[] books;
    private int size;
    private int ptr;

    Library(int size) {
        books = new Book[size];
        this.size = size;
        ptr = 0;
    }

    public void addBook(String title, String author) {
        if (ptr == size) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[ptr++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < ptr; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }
}