package Logic;

/**
 * Created by lywar on 06.08.2017.
 */
public interface Cell<T> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void draw(T paint, boolean real);
}
