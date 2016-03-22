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
