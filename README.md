Code to rank Journals according to their score

Assumptions: 

1) Journals are scored once, in the year of their 
publishing, therefore I didn't allow for multiple scores per journal.

2) Journals cannot have a negative score. The code would still work for negative
scores if we remove the check in the Journal constructor.

The code consists of two classes Journal, which models a Journal, and 
JournalSortedSet, which is wrapper around a TreeSet data structure. Journals can 
be added to a JournalSortedSet and its iterator() method will always contain the
Journals ranked by their score and name in case of an equal score.

I took the liberty of not skipping ranks. I.e. if two journals have the same 
score and share rank 1, then the next rank is 2 and not 3. I thought it makes
more sense not to have empty ranks. If that is important in the problem it can
be corrected with a couple of lines of code that remembers how many Journals
share a rank and set the next rank.

Regarding exception handling, exceptions that will never be thrown, i.e. the 
Iterator.remove() method being called twice after the Iterator.next() method,
are not handled.

The code works as can be seen in the tests. Journals are added to an instance of
class JournalSortedSet. When an iterator is obtained for that set it contains
all non-review Journals ranked in order as described above. 

Example:

JournalSortedSet journals = new JournalSortedSet();
journals.add(new Journal(name, score, year));
journals.add(new Journal(name, score, year));
journals.add(new Journal(name, score, year));

Iterator<Journals> = journals.iterator();
