Author: Luiz Eduardo Busato
License: see file LICENSE.txt

primesPrinter  is a  simple program  that illustrates  object-oriented
design principles.

primesPrinter is kept as a  git repository where each branch exemplify
the  evolution   of  the   software  after   the  application   of  an
object-oriented design principle as follows: 
monolith branch: a monolithic implementation  of a sieve primes number
printer

singleResponsibility branch: refactors monolith  to separate code into
smaller classes, each class deals with a single responsibility.

dependencyInversion branch: refactors  singleResponsibility to show an
initial version of  a code that depends on  an abstraction (interface)
instead of an implementation.  The design prepares the code for future
changes that improve reuse and cohesion.
			  




