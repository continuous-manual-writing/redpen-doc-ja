[![Build Status](https://travis-ci.org/continuous-manual-writing/redpen-doc-ja.svg?branch=master)](https://travis-ci.org/takahi-i/continuous-manual-writing/redpen-doc-ja)

NOTE
====

本文書の更新は v1.8 で終了します。今後日本語の RedPen ドキュメントは [redpen-doc](https://github.com/redpen-cc/redpen-doc) に引き継がれます。


redpen-doc
==========

本リポジトリは、RedPen の日本語ドキュメントを保持します。

必要なツール
-------------
- Asciidoctor
- rubygem-coderay

Download and Build
----------------------

ドキュメントは以下のステップでビルドできます。

1. ホームディレクトリに移動 ('username' というアカウント名なら /home/username)

```bash
    $ cd username
```

2. ソースファイルの取得

```bash
    $ git clone git@github.com:continuous-manual-writing/redpen-doc-ja.git
```

3. ドキュメントのコンパイル

```bash
    $ cd redpen-doc-ja
    $ make html
```
