# msgpack-cljs

A Clojurescript implementation of msgpack. This library's structure is *heavily* adapted from the great work done on (clojure-msgpack)[https://github.com/edma2/clojure-msgpack]. Support for Clojure `keyword`, `symbol`, `char`, `ratio`, and `set` are all included by default as Extension types for convenience and to be compatible with `clojure-msgpack`. 

## Usage

`pack` takes an arbitrary object and converts it into a `Uint8Array`. 

`unpack` takes a `Uint8Array` and converts it back into an arbitrary object.

## Improvements

This library could use to be refactored. We just use this internally at (pkc.io)[PKC], so, if there is demand, we are open to making improvements.

## Copyright
Copyright © 2018

Distributed under the MIT license.
