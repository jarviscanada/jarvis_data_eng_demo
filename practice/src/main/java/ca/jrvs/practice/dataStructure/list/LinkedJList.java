package ca.jrvs.practice.dataStructure.list;

public class LinkedJList<E> implements JLists<E> {

  /**
   * Appends the specified element to the end of this list (optional
   * operation).
   *
   * @param e element to be appended to this list
   * @return <tt>true</tt>
   * @throws NullPointerException if the specified element is null and this
   *         list does not permit null elements
   */
  @Override
  public boolean add(E e) {
    return false;
  }

  /**
   * Returns an array containing all of the elements in this list in proper
   * sequence (from first to last element).
   *
   * <p>This method acts as bridge between array-based and collection-based
   * APIs.
   *
   * @return an array containing all of the elements in this list in proper
   *         sequence
   */
  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  /**
   * The size of the ArrayList (the number of elements it contains).
   *
   */
  @Override
  public int size() {
    return 0;
  }

  /**
   * Returns <tt>true</tt> if this list contains no elements.
   *
   * @return <tt>true</tt> if this list contains no elements
   */
  @Override
  public boolean isEmpty() {
    return false;
  }

  /**
   * Returns the index of the first occurrence of the specified element
   * in this list, or -1 if this list does not contain the element.
   * More formally, returns the lowest index <tt>i</tt> such that
   * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
   * or -1 if there is no such index.
   * @param o
   */
  @Override
  public int indexOf(Object o) {
    return 0;
  }

  /**
   * Returns <tt>true</tt> if this list contains the specified element.
   * More formally, returns <tt>true</tt> if and only if this list contains
   * at least one element <tt>e</tt> such that
   * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
   *
   * @param o element whose presence in this list is to be tested
   * @return <tt>true</tt> if this list contains the specified element
   * @throws NullPointerException if the specified element is null and this
   *         list does not permit null elements
   */
  @Override
  public boolean contains(Object o) {
    return false;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
   */
  @Override
  public E get(int index) {
    return null;
  }

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left (subtracts one from their
   * indices).
   *
   * @param index the index of the element to be removed
   * @return the element that was removed from the list
   * @throws IndexOutOfBoundsException {@inheritDoc}
   */
  @Override
  public E remove(int index) {
    return null;
  }

  /**
   * Removes all of the elements from this list (optional operation).
   * The list will be empty after this call returns.
   */
  @Override
  public void clear() {

  }
}
