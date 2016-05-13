class ApplicationController < ActionController::Base
  # Prevent CSRF attacks by raising an exception.
  # For APIs, you may want to use :null_session instead.
  
  # 以下の1行は消さないでください
  def default_url_options() {instanceId: 'a2db37e8e8'}.merge(super) end
end

