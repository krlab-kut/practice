class NotesController < ApplicationController
  def new
  end
  
  def create
    @note = Note.new
    @note.title = params[:title]
    @note.content = params[:content]
    @note.save
    redirect_to note_path(@note.id)
  end
  
  def index
    @notes = Note.all
  end
  
  def show
    @note = Note.find(params[:id])
  end
  
  def edit
    @note = Note.find(params[:id])
  end
  
  def update
    @note = Note.find(params[:id])
    @note.title = params[:title]
    @note.content = params[:content]
    @note.save
    redirect_to note_path(@note.id)
  end
  
  # destroyアクションを追加してください
  def destroy
    @note = Note.find(params[:id])
    @note.destroy
    redirect_to notes_path(@note.id)
  end
  
end
