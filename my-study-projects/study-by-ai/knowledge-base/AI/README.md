# 🤖 Prompt Engineering Techniques for LLMs

## 📋 Table of Contents

- [Introduction](#introduction)
- [Why Prompt Engineering Matters](#why-prompt-engineering-matters)
- [Basic Prompt Patterns](#basic-prompt-patterns)
- [Advanced Prompt Strategies](#advanced-prompt-strategies)
- [Common Pitfalls & How to Avoid Them](#common-pitfalls--how-to-avoid-them)
- [Practical Examples](#practical-examples)
- [References & Further Reading](#references--further-reading)

---

## 📝 Introduction
## 📝 Introdução

Prompt engineering is the art of crafting effective instructions for large language models (LLMs) to obtain accurate, relevant, and useful responses. Well-designed prompts can dramatically improve the quality of outputs.
A engenharia de prompt é a arte de criar instruções eficazes para grandes modelos de linguagem (LLMs) a fim de obter respostas precisas, relevantes e úteis. Prompts bem elaborados podem melhorar drasticamente a qualidade das respostas.

---

## ❓ Why Prompt Engineering Matters
## ❓ Por que Engenharia de Prompt é Importante

- Guides the LLM to understand your intent.
  - Guia o LLM para entender sua intenção.
- Reduces ambiguity and increases precision.
  - Reduz a ambiguidade e aumenta a precisão.
- Helps control the format, tone, and depth of the response.
  - Ajuda a controlar o formato, o tom e a profundidade da resposta.
- Essential for building reliable AI-powered applications.
  - Essencial para construir aplicações confiáveis com IA.

---

## 🛠️ Basic Prompt Patterns
## 🛠️ Padrões Básicos de Prompt

- **Direct Instruction:**  
  _"Summarize the following text in one paragraph."_
  - **Instrução Direta:**  
    _"Resuma o texto a seguir em um parágrafo."_

- **Role Assignment:**  
  _"You are a senior Java developer. Explain the difference between HashMap and TreeMap."_
  - **Atribuição de Papel:**  
    _"Você é um desenvolvedor Java sênior. Explique a diferença entre HashMap e TreeMap."_'

- **Step-by-Step Reasoning:**  
  _"List the steps required to implement a binary search algorithm in Java."_
  - **Raciocínio Passo a Passo:**  
    _"Liste os passos necessários para implementar um algoritmo de busca binária em Java."_'

- **Input/Output Example:**  
  _"Given the input '2, 4, 6', output the sum."_
  - **Exemplo de Entrada/Saída:**  
    _"Dada a entrada '2, 4, 6', forneça a soma."_'

---

## 🚀 Advanced Prompt Strategies
## 🚀 Estratégias Avançadas de Prompt

- **Few-Shot Examples:**  
  Provide 2-3 examples of input and desired output to guide the model.
  - **Exemplos Few-Shot:**  
    Forneça 2-3 exemplos de entrada e saída desejada para guiar o modelo.

- **Chain-of-Thought:**  
  Ask the model to explain its reasoning step by step.  
  _"Explain your answer step by step."_
  - **Cadeia de Pensamento:**  
    Peça ao modelo para explicar seu raciocínio passo a passo.  
    _"Explique sua resposta passo a passo."_'

- **Constraints & Formatting:**  
  Specify output format, length, or style.  
  _"Respond in Markdown with code blocks only."_
  - **Restrições e Formatação:**  
    Especifique o formato, comprimento ou estilo da resposta.  
    _"Responda em Markdown apenas com blocos de código."_'

- **Clarifying Ambiguity:**  
  Ask the model to request clarification if the prompt is unclear.
  - **Esclarecendo Ambiguidade:**  
    Peça ao modelo para solicitar esclarecimento se o prompt estiver ambíguo.

---

## ⚠️ Common Pitfalls & How to Avoid Them
## ⚠️ Armadilhas Comuns e Como Evitá-las

- **Vague Prompts:**  
  _Bad:_ "Tell me about Java."  
  _Better:_ "List three key features of Java and provide a code example for each."
  - **Prompts Vagamente Definidos:**  
    _Ruim:_ "Fale sobre Java."  
    _Melhor:_ "Liste três características principais do Java e forneça um exemplo de código para cada uma."

- **Overly Broad Requests:**  
  Break down complex tasks into smaller, focused prompts.
  - **Solicitações Muito Amplas:**  
    Divida tarefas complexas em prompts menores e mais focados.

- **Lack of Context:**  
  Provide necessary background or examples.
  - **Falta de Contexto:**  
    Forneça o contexto necessário ou exemplos.

---

## 💡 Practical Examples
## 💡 Exemplos Práticos

- _"Generate a Markdown file with a summary table of Java collection types, including emojis."_
  - _"Gere um arquivo Markdown com uma tabela resumo dos tipos de coleções Java, incluindo emojis."_
- _"Write a prompt that asks an LLM to explain the difference between synchronous and asynchronous programming, with examples."_
  - _"Escreva um prompt que peça a um LLM para explicar a diferença entre programação síncrona e assíncrona, com exemplos."_
- _"Create a checklist for reviewing code quality in Python, formatted as a Markdown list."_
  - _"Crie um checklist para revisar a qualidade de código em Python, formatado como uma lista Markdown."_'

---

## 📚 References & Further Reading
## 📚 Referências e Leituras Adicionais

- [OpenAI Cookbook: Prompt Engineering](https://github.com/openai/openai-cookbook)
- [Awesome ChatGPT Prompts](https://github.com/f/awesome-chatgpt-prompts)
- [Prompt Engineering Guide](https://www.promptingguide.ai/)

---
