Rails.application.routes.draw do
  get '/notes/new' => 'notes#new'
  post '/notes' => 'notes#create'
  get '/notes' => 'notes#index'
  get '/notes/:id' => 'notes#show', as: 'note'
  get '/notes/:id/edit' => 'notes#edit', as: 'edit_note'
  patch '/notes/:id' => 'notes#update', as: 'update_note'
  # destroyアクションへのルーティングを設定してください
  delete '/notes/:id' => 'notes#destroy', as: 'destroy_note'

  root 'home#top'
  get '/about' => 'home#about'
  
end
