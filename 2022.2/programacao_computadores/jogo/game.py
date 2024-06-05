import pygame
from sys import exit

#algumas variaveis 
s_width = 800
s_height = 400

#config
pygame.init()
screen = pygame.display.set_mode((s_width, s_height))
pygame.display.set_caption('joguinho')
clock = pygame.time.Clock()

ceu_layer = pygame.image.load('assets/Background/ceu2.png')
terra_layer = pygame.image.load('assets/Background/terra.png')

run = True
while run:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False
            pygame.quit()
            exit()

    screen.blit(ceu_layer, (0,-50))
    screen.blit(terra_layer, (0, 300))

    pygame.display.update()
    clock.tick(60)