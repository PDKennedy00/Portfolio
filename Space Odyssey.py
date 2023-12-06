#This is a text-based adventure game about a space explorer who has crashed on/
#alien world and now has to find a way to leave the planet
#The game is classed Space Odyssey
#This is a Project for my Intro to Scripting Course at SNHU 2023
#This code is made by myself Dawson Kennedy


#add a dictionary to link other rooms
rooms = {
        'Hibernation Chambers': {'West': 'Storage'},
        'Storage': {'West': 'Cockpit', 'South': 'Jungle', 
                'East': 'Hibernation Chambers', 'Item': 'Picture'},
        'Cockpit': {'East': 'Storage', 'Item': 'Fruit'},
        'Jungle': {'North': 'Storage', 'West': 'Jungle Temple',
               'East': 'Castle: Main Lobby', 'Item': 'Capitans Hat'},
        'Jungle Temple': {'East': 'Jungle', 'West': 'Tomb', 'Item': 'Ancient Armor'},
        'Tomb': {'North': 'Relic Room', 'East': 'Jungle Temple', 'Item': 'Ancient Sword'},
        'Relic Room': {'South': 'Tomb', 'Item': 'Shiny Object'},
        'Castle: Main Lobby': {'West': 'Jungle', 'North': 'Throne Room',
                           'East': 'Pirate Ship: Main Corridor'},
        'Throne Room': {'East': 'Pirate Ship: Main Corridor'},
        'Pirate Ship: Main Corridor': {'North': 'Pirate Throne', 
                                   'East': 'Security Room', 'West': 'Throne Room'},
        'Pirate Throne': {'South': 'Pirate Ship: Main Corridor'},
        'Security Room': {'West': 'Pirate Ship: Main Corridor', 'Item': 'Pirate Blaster'}
    }

#start player in Hibernation Chambers
currentRoom = 'Hibernation Chambers'

inventory = []

#instructions on how to play game
userinstruction = '''Welcome to Space Odyssey!
Reach the Pirate Throne room with all 6 items to WIN the game!
To move type: go North, go East, go West, go South.
Add to Inventory: get 'item name' 
------------------------------------------------------------------'''

#make a list to store the directions
direction = ['go North', 'go South', 'go East', 'go West']

#display instruction on screen
print(userinstruction)

#loop it
while True:
    #condition to end game
    if currentRoom == 'Pirate Throne':
        #check for number of items to see if player win or loses game
        if len(inventory) == 7:
            #condition to exit loop if player collects all items and wins
            print('Congrats! you have collected all items and defeated the Captain')
        else:
            #condition to exit exit loop if player loses
            print('The Captain has no time for trespassers and has dealt with you accordingly!')
            print('You have lost the game!')
        break
    #display the player's current position
    print('You are in the {}.'.format(currentRoom))
    #print the current inventory
    print('Inventory: ', inventory)
    print("------------------------------")
       
    #user input for movement
    usermove = input('\nEnter your moves or exit to exit the game: ')
    
    #controlling movement
    if usermove in direction:
        move=usermove.split(' ')
        if move[1] in rooms[currentRoom]:
            currentRoom = rooms[currentRoom][move[1]]
            print(currentRoom)
        else:
            #if player enters invalid move
            print('Invalid Move!')    
    
    #get item condition
    item = rooms[currentRoom].get('Item')
    
    if rooms[currentRoom].get('Item'):
        print('You see a {}',rooms[currentRoom].get('Item'))
        if item is not None and usermove == 'get '+ item:
            if item in inventory:
                print('You already have this item, move along!')
            else:
                inventory.append(item)     
    #catch all for all invalid inputs
    else:
            print('Invalid input')