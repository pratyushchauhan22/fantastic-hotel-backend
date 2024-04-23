## API ENDPOINTS 

### `POST /rooms/add/new-room`
add a new room to database
### `GET /rooms/all-rooms`
get all rooms from the database
### ` GET /rooms/room/types`
user can filter the rooms based on types
### `DELETE /rooms/delete/room/{roomId}`🔐
admin can delete any room from the database
### `PUT /rooms/update/{roomId}`🔐
admin can any room in the database
### `GET /rooms/available-rooms`
user can view the rooms available for bookings
### `GET /bookings/all-bookings`🔐
admin can view all the bookings 
### ` GET /confirmation/{confirmationCode}`
user can view their booking status by confirmation code
### `DELETE /bookings/booking/{bookingId}/delete`
user can delete their bookings 
### `POST /auth/register-user`
new user can register themselves
### `POST /auth/login`
registered users can login into the application
### `GET /users/all`🔐
admin can view all the registered users 
### `DELETE /users/delete/{userId}`🔐
admin can delete any user from the application
### `GET /roles/all-roles`🔐
admin can view all the roles created
### `POST /roles/create-new-role`🔐
admin can create new roles for the application
### `POST /roles/assign-user-to-role`🔐
admin can assign any rolee to any user 
