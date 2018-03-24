
# coding: utf-8

# In[55]:


def findSequences(caminhoArquivo): # Passa o caminho do arquivo 
    
  #  r = open(caminhoArquivo,"r") # pega o conteúdo em forma de string
    Sequencia = caminhoArquivo
    
    lista = [] # Armazena todas as sequencias válidas
    flag = 0 # Auxilia para sabermos onde ocmeça um aminácido
    newcont = 0 # itera sobre a String para sabermos o início e o fim de uma sequencia válida
    
    for cont in range(0,3): #loop visando os 3 caracteres do primeiro codon
        
        while(newcont < len(Sequencia)): # loop completo sobre a string
            
            #Inicio de uma sequência por um stop codon válido
            if(flag == 0 and (Sequencia[newcont-3:newcont] == "ATG" or Sequencia[newcont-3:newcont] == "CUG" or Sequencia[newcont-3:newcont] == "AUU" or Sequencia[newcont-3:newcont] == "AUA" or Sequencia[newcont-3:newcont] == "GUG" or Sequencia[newcont-3:newcont] == "UUG")):
                flag = newcont - 3
                
            #termina e armazena uma sequncia por um stop codon válido    
            if(Sequencia[newcont:newcont+3] == "UAA" or Sequencia[newcont:newcont+3] == "UAG" or Sequencia[newcont:newcont+3] == "UGA"):
                lista.append(Sequencia[flag:newcont+3]+"\n") #Adiciona sequência válida na lista
                newcont = newcont + 3
                flag = 0
            newcont = newcont + 1
            
        Sequencia = Sequencia[cont+1:len(Sequencia)] # Após cada loop o começo de uma nova iteração é sempre na próxima letra do primeiro codon 
        arq = open('SequenciasValidas.txt', 'w') # cria um arquivo e adiciona as sequencias válidas no mesmo diretório desse arquivo
        arq.writelines(lista)
        arq.close()
        
findSequences("Coloque aqui o caminho do arquivo da sequencia")

