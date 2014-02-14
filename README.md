# clj-cmudict

*clj-cmudict* is a simple wrapper for the [CMU Pronouncing Dictionary](http://www.speech.cs.cmu.edu/cgi-bin/cmudict).

## Installation
To install the lastest version from [clojars](https://clojars.org/), just add the following vector to the `:dependencies` section of your `project.clj` file.

```clj
[clj-cmudict "0.1.0"]
```

To install the latest version from the current source, clone the repository and install with leiningen.

```
git clone https://github.com/Yomguithereal/clj-cmudict.git
cd clj-cmudict
lein install
```

Then include the same vector within your `project.clj` and you should be good to go.

**N.B.** The library is quite heavy for it encapsulates the cmudict as a whole an is not an API client.

## Usage

To get the arpabet code of a single word

```clj
(use 'clj-cmudict.core)

(first (arpabet "shine"))
(:SH :AY1 :N)

 The arpabet function returns a vector of possibilities
(arpabet "pronunciation")
[(:P :R :OW0 :N :AH2 :N :S :IY0 :EY1 :SH :AH0 :N)
 (:P :R :AH0 :N :AH2 :N :S :IY0 :EY1 :SH :AH0 :N)]
```

## License

```
# ========================================================================
# Copyright (C) 1993-2008 Carnegie Mellon University. All rights reserved.
#
# Redistribution and use in source and binary forms, with or without
# modification, are permitted provided that the following conditions
# are met:
#
# 1. Redistributions of source code must retain the above copyright
#    notice, this list of conditions and the following disclaimer.
#    The contents of this file are deemed to be source code.
#
# 2. Redistributions in binary form must reproduce the above copyright
#    notice, this list of conditions and the following disclaimer in
#    the documentation and/or other materials provided with the
#    distribution.
#
# This work was supported in part by funding from the Defense Advanced
# Research Projects Agency, the Office of Naval Research and the National
# Science Foundation of the United States of America, and by member
# companies of the Carnegie Mellon Sphinx Speech Consortium. We acknowledge
# the contributions of many volunteers to the expansion and improvement of
# this dictionary.
#
# THIS SOFTWARE IS PROVIDED BY CARNEGIE MELLON UNIVERSITY ``AS IS'' AND
# ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
# THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
# PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL CARNEGIE MELLON UNIVERSITY
# NOR ITS EMPLOYEES BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
# SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
# LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES LOSS OF USE,
# DATA, OR PROFITS OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
# THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
# (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
# OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
#
# ========================================================================
```
