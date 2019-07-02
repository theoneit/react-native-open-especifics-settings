
Pod::Spec.new do |s|
  s.name         = "RNOpenEspecificsSettings"
  s.version      = "1.0.0"
  s.summary      = "RNOpenEspecificsSettings"
  s.description  = <<-DESC
                  RNOpenEspecificsSettings
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "Flavio Teodosio" => "flavioteodosiobr@gmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNOpenEspecificsSettings.git", :tag => "master" }
  s.source_files  = "RNOpenEspecificsSettings/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  