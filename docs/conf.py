#!/usr/bin/env python3
# -*- coding: utf-8 -*-

extensions = ['sphinx.ext.intersphinx', 'sphinx.ext.todo', 'sphinx.ext.githubpages']

project = 'Vault'
copyright = '2017, Neolumia'
author = 'Neolumia'

version = '1.0'
release = '1.0'

html_static_path = ['static']
templates_path = ['templates']
exclude_patterns = ['build']

pygments_style = 'sphinx'

html_theme = 'alabaster'
# html_theme_options = {}

todo_include_todos = False

source_suffix = '.rst'
master_doc = 'index'

language = None

# Output file base name for HTML help builder.
htmlhelp_basename = 'vaultdoc'
