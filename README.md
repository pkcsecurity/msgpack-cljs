# msgpack-cljs

A Clojurescript implementation of msgpack. This library's structure is *heavily* adapted from the great work done on [clojure-msgpack](https://github.com/edma2/clojure-msgpack). Support for Clojure `keyword`, `symbol`, `char`, `ratio`, and `set` are all included by default as Extension types for convenience and to be compatible with `clojure-msgpack`. 

## Usage

`pack` takes an arbitrary object and converts it into a `Uint8Array`. 

`unpack` takes a `Uint8Array` and converts it back into an arbitrary object.

## Improvements

This library could stand to be refactored. We just use this internally at [PKC](https://pkc.io), so, if there is demand (or interest) in making this more feature-rich, we are open to making improvements. Just be vocal, otherwise we'll keep it simple.

## Copyright
Copyright 2018 PKC Security

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at:

[http://www.apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
